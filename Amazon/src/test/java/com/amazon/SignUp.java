package com.amazon;

import baseApi.Base;
import homeFeatures.AmazonBase;
import org.testng.annotations.Test;
import utiliy.DataReader;

import java.io.IOException;

/**
 * Created by rrt on 4/12/2015.
 */
public class SignUp extends AmazonBase {
    public DataReader dr = new DataReader();
    String path = "C:\\Users\\rrt\\workspace-March2015\\Functional-Automation\\Amazon\\data\\file1.xls";

    @Test
    public void signIn()throws IOException,InterruptedException{
        String [][] value = dr.fileReader(path);
        sleepFor(2);
        clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");
        clickByCss(".nav-action-inner");
        sleepFor(2);
        String emailLocator = value[1][0];
        String email = value[1][1];
        String passLocator = value[2][0];
        String pass = value[2][1];
        typeByCss(emailLocator, email);
        typeByCss(passLocator, pass);
        sleepFor(4);

    }
}
