package cj.org.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 主题消息消费者
 *
 * @author cj;
 * @create 2017-12-29 11:27
 **/
public class TopicRevice {

    /**
     * 指定ActiveMQ服务的地址
     */
    private static final String URL = "tcp://127.0.0.1:61616";
    /**
     * 指定队列的名称
     */
    private static final String TOPIC_NAME = "topic-test";


    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);

        Connection connection = connectionFactory.createConnection();

        connection.start();


        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Destination destination = session.createTopic(TOPIC_NAME);


        MessageConsumer consumer = session.createConsumer(destination);
        consumer.setMessageListener(new MessageListener() {
                                        public void onMessage(Message message) {
                                            TextMessage textMessage = (TextMessage)message;
                                            try {
                                                System.out.println("接收消息：" + textMessage.getText());
                                            } catch (JMSException e) {
                                                System.out.println("接收消息异常：");
                                                e.printStackTrace();
                                            }
                                        }
                                    }

        );
        System.out.println("Topic消息接受者已启动！");
    }

}
