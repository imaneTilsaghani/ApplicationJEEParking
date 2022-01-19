/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import service.PlaceService;

/**
 *
 * @author Imane
 */
public class test {
    public static void main(String[] args) {
        PlaceService ps = new PlaceService();
       System.out.println(ps.findetat(4)); 
    }
}
