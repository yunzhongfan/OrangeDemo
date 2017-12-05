package org.base.annotation;

import org.base.annotation.test.Apple;

public class FruitRun {
	/**
     * @param args
     */
    public static void main(String[] args) {
        
        FruitInfoUtil.getFruitInfo(Apple.class);
        
    }
}
