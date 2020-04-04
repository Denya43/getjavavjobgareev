package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

/**
 * Created by Denis on 01.04.2020.
 */
public enum OrganizationType implements Serializable{
    OOO("OOO"), OAO("OAO"), ZAO("ZAO"), IP("IP");

    @XStreamAlias("type")
    String value;

    OrganizationType(String value){
        this.value = value;
    }
}
