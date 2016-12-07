package producer;

import com.rabbitmq.client.ConnectionFactory;

import model.DVD;

import com.rabbitmq.client.Connection;

import java.io.IOException;

import com.rabbitmq.client.Channel;

public class Producer {

	private static final String EXCHANGE_NAME = "dvds";
	
	public void sendDVD(String title, String year, String price){
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost("localhost");
			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();

			channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

			DVD message = new DVD(title, Integer.valueOf(year), Double.valueOf(price));

			channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
			System.out.println("Sent '" + message + "'");

			channel.close();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
