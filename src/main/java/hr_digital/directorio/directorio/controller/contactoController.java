package hr_digital.directorio.directorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hr_digital.directorio.directorio.entity.contacto;
import hr_digital.directorio.directorio.service.contactoService;

@RestController
@RequestMapping(value = "/directorio")
@CrossOrigin(origins = "*")
public class contactoController {
  @Autowired
  private contactoService cService;
  
  @GetMapping(value = "by_id")
  public ResponseEntity<?> contacto(@RequestParam(name = "id",required = true) Integer id){
      return new ResponseEntity<>(this.cService.get_by_id(id), HttpStatus.OK);
  }
  @GetMapping
  public ResponseEntity<?> registro(){
      List<contacto> contactos= this.cService.get_Contactos();
      return new ResponseEntity<List<contacto>>(contactos, HttpStatus.OK);
  }
  @PostMapping
  public ResponseEntity<?> crea(@RequestBody contacto c){
  return new ResponseEntity<contacto>(this.cService.create(c), HttpStatus.OK);
  }
  @PutMapping
  public ResponseEntity<?> actualiza(@RequestBody contacto c){
      return new ResponseEntity<>(this.cService.update(c), HttpStatus.OK);
  }
  @DeleteMapping
  public void elimina (@RequestParam(name = "id",required = true) Integer id){
    this.cService.delete(id);
  }
}
