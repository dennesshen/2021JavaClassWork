/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.cdc;

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

/**
 *
 * @author dennesshen
 */
//工具類別
public class Util {
     public static CDC[] getCds(){
         // Json 資料網址
        String path= "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        // 建立 task 工作, 工作內容是 new JsonThread(path)
        FutureTask<String> task = new FutureTask<>(new JsonThread(path));
        // 建立執行緒來執行 task 的工作
        new Thread(task).start();
        try {
            // 利用 get() 來得到工作回報
            String json = task.get(); // 取得 json 資料
            //將json的字串轉換成陣列ＣＤＣ[]陣列，利用Gson
            CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
            return cdcs;

        } catch (Exception e) {
        }
         
         return null;
     }
    
}
