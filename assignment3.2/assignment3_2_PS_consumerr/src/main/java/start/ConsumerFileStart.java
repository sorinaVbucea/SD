package start;

import com.rabbitmq.client.*;

import controller.FileController;
import model.DVD;

import java.io.IOException;

public class ConsumerFileStart {

	private static final String EXCHANGE_NAME = "dvds";
	private static FileController controller = new FileController();

	public static void main(String[] argv) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
		String queueName = channel.queueDeclare().getQueue();
		channel.queueBind(queueName, EXCHANGE_NAME, "");

		System.out.println("Waiting for messages...");

		Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				DVD message = new DVD();
				message = message.getDVD(body);
				System.out.println("Received '" + message.toString() + "'");
				controller.manageService(message);
			}
		};
		channel.basicConsume(queueName, true, consumer);
	}

}
