package hr_digital.directorio.directorio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion; 

    public contacto (Integer id, String nombre, String apellido, String celular, String correo, String direccion){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
        this.correo=correo;
        this.direccion=direccion;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setCelular(String celular){
        this.celular=celular;
    }
    public String getCelular(){
        return this.celular;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getCorreo(){
        return this.correo;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
}
