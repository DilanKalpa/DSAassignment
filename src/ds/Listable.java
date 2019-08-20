/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author Dilan
 */
interface Listable {
    
    public abstract int compareTo(Listable other);
    
    public abstract Listable copy();
}
