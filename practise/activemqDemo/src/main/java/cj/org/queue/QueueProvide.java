package cj.org.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


/**
 * Jms  队列消息提供者
 * 队列消息测试
 *
 * @author nbc
 * @create 2017-12-28 15:24
 **/
public class QueueProvide {

    /**
     *
     *
     **/
    final static private String URL = "http://127.0.0.1:86861";

    final static private String QUEUE_NAME = "queue_test";


    public static void main(String[] args) {
       /* 1.创建ConnectionFactory */
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);


        try {
            //创建连接
            Connection connection = connectionFactory.createConnection();
            connection.start();
            // 4.创建会话（第一个参数：是否在事务中处理）
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //创建一个目的地
            Destination destination = session.createQueue(QUEUE_NAME);
            // 6.创建一个生产者
            MessageProducer producer = session.createProducer(destination);

            for (int i = 0; i < 100; i++) {
                TextMessage message = session.createTextMessage("消息" + i);
                producer.send(message);
                System.out.println("消息" + i + "发送完毕");
            }

            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }


}
