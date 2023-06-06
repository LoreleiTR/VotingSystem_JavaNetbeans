
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lorelei
 */
public class DataShare {
    private static List<String> dataShared = new ArrayList<>();
    private static Integer v1voted = 0;
    private static Integer v2voted = 0;
    private static Integer voters = 0;
    public static boolean checkData(String data) {
        return dataShared.contains(data);
    }
    public void addData(String data) {
        dataShared.add(data);
    }
    
    public List<String> getData(){
        return dataShared;
    }
    public Integer setvote(Integer data) {
        voters = data;
        return voters;
    }
    public Integer setNumv1(Integer data) {
        v1voted = data;
        return v1voted;
    }
    public Integer setNumv2(Integer data) {
        v2voted = data;
        return v2voted;
    }
    public Integer numvote() {
        return voters;
    }
    public Integer numv1() {
        return v1voted;
    }
    public Integer numv2() {
        return v2voted;
    }
    public String getv1() {
        return v1voted.toString();
    }
    
    public String getv2() {
        return v2voted.toString();
    }
}
