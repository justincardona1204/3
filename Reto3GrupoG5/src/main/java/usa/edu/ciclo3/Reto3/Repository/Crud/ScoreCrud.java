/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package usa.edu.ciclo3.Reto3.Repository.Crud;

import org.springframework.data.repository.CrudRepository;
import usa.edu.ciclo3.Reto3.Model.Score;


/**
 *
 * @author justi
 */
public interface ScoreCrud extends CrudRepository<Score,Integer>{
    
}