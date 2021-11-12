package com.devops.com.devops.maven.eclipse;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class devopstest {
    @Test
    public void test_JUnit() {
        String str1="This is the testcase in this class!";
        System.out.println(str1);
        assertEquals("This is the testcase in this class", str1);
    }
}