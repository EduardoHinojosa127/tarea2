/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import modelos.Alumnos;

/**
 *
 * @author Tecsup
 */
public interface IAlumnosDAO {
    public boolean resgitrar (Alumnos alumno);
    public List<Alumnos> obtener();
    public boolean actualizar (Alumnos alumno);
    public boolean eliminar (String[] codigos);
    public Alumnos buscar(int codigo);
}