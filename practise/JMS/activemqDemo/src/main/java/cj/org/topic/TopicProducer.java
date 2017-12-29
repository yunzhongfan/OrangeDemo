package cj.org.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息主题生产者
 *
 * @author cj
 * @create 2017-12-29 11:10
 **/
public class TopicProducer {

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

        MessageProducer producer = session.createProducer(destination);

        for (int i = 0; i < 100; i++) {

            // 7.创建消息
            TextMessage textMessage = session.createTextMessage("test" + i);

            producer.send(textMessage);
            System.out.println("Toipc消息:test" + i);
        }
        System.out.println("Toipc消息发送者已发送消息完毕！");
        connection.close();
    }


}

