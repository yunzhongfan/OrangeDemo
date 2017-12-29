package cj.org.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息队列 消息接受者
 */
public class QueueRevice {

    /**
     *
     *
     **/
    private static final String URL = "tcp://127.0.0.1:61616";
    /** 指定队列的名称 */
    private static final String QUEUE_NAME = "queue-test";


    public static void main(String[] args) {
  /* 1.创建ConnectionFactory */
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);
        try {
            //创建连接
            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue(QUEUE_NAME);
            // 6.创建一个消费者
            MessageConsumer consumer = session.createConsumer(destination);
            // 7.创建一个监听器
            consumer.setMessageListener(new MessageListener() {
                public void onMessage(Message message) {
                    TextMessage textMessage = (TextMessage) message;
                    try {
                        System.out.println("接收消息：" + textMessage.getText());
                    } catch (JMSException e) {
                        System.out.println("接收消息异常：");
                        e.printStackTrace();
                    }
                }
            });

// 8.关闭连接
            //connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Hello World!");
    }
}
