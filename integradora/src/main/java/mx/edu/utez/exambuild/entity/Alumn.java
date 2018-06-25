/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.exambuild.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author MarcoAntonio
 */
@Entity
@Table
public class Alumn {

    @Id
    Integer id;
    @Column
    String nombre;

}
