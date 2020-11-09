/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
public class TripleTacoBox implements TacoBox {
    private Integer num;
            
    public TripleTacoBox() {
        this.num = 3;
    }
    
    @Override
    public int tacosRemaining() {
        return this.num;
    }

    @Override
    public void eat() {
        if (this.num > 0) {
            this.num--;
        }
    }
    
}
