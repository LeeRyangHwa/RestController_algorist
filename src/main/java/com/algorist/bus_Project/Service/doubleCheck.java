package com.algorist.bus_Project.Service;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class doubleCheck<T,V> {

    private boolean check;

    public boolean setCheck(HashSet<T> set, V value){
        check = false;
        if(set.contains(value)){
            check =  true;
        }
        return check;
    }
}
