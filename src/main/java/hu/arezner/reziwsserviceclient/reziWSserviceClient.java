/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.arezner.reziwsserviceclient;

/**
 *
 * @author ati
 */
public class reziWSserviceClient {
    
    public static void main(String[] args) {
        ReziWebServiceV1_Service reziWS = new ReziWebServiceV1_Service();
        ReziWebServiceV1 reziWsPort = reziWS.getReziWebServiceV1Port();
        String helloReply = reziWsPort.hello("Rezi");
        System.out.println("hello called, result: " +helloReply);
        int addResult = reziWsPort.addOperation(2, 8);
        System.out.println("add called, result: " +addResult);
    }
    
}
