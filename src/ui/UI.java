/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Animal;
import java.util.ArrayList;

/**
 *
 * @author Fenryr
 */
public interface UI {
    
    public int MainMenu (ArrayList<Animal> animals);
    public int TypeOfAnimal();
    public void exportPet(ArrayList<Animal> animals);

}
