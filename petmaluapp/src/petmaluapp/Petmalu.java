package petmaluapp;

import java.io.Serializable;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16408022
 */
public abstract class Petmalu implements Serializable {
    protected int DepD; //departure Date
    protected int RetD; //Return Date
    protected int HtlChkID;  //Hotel Check-in date
    protected int HtlChkOD; //Hotel Check-out date
    protected  ArrayList<Integer> ToDo; //input for things to do in vacation
    
    public Petmalu(){
        DepD = 0;
        RetD = 0;
        HtlChkID = 0;
        HtlChkOD = 0;
        ArrayList<Integer> ToDo = new ArrayList<Integer>();       
    }

    public int getDepD() {
        return DepD;
    }

    public void setDepD(int DepD) {
        this.DepD = DepD;
    }

    public int getRetD() {
        return RetD;
    }

    public void setRetD(int RetD) {
        this.RetD = RetD;
    }

    public int getHtlChkID() {
        return HtlChkID;
    }

    public void setHtlChkID(int HtlChkID) {
        this.HtlChkID = HtlChkID;
    }

    public int getHtlChkOD() {
        return HtlChkOD;
    }

    public void setHtlChkOD(int HtlChkOD) {
        this.HtlChkOD = HtlChkOD;
    }

    public ArrayList<Integer> getToDo() {
        return ToDo;
    }

    public void setToDo(ArrayList<Integer> ToDo) {
        this.ToDo = ToDo;
    }

    public String printDetails(){
        return "Trip Details"+DepD+","+RetD+"+"+HtlChkID+"+"+HtlChkOD+","+ToDo;
    }
}
