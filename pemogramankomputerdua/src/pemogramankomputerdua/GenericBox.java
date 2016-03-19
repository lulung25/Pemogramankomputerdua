/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemogramankomputerdua;

/**
 *
 * @author ayulia
 * * @param <E>
 */
public class GenericBox <E>{
    //Private E content;
    private E content;
    
    //Constructor
    public GenericBox(E content){
        this.content = content;
    }
    
    public E getContent(){
        return content;
    }
    
}
