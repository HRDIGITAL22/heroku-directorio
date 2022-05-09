package hr_digital.directorio.directorio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hr_digital.directorio.directorio.entity.contacto;
import hr_digital.directorio.directorio.repository.contactoRepository;

@Service
@Transactional
public class contactoService {
  @Autowired
  private contactoRepository crepository;
  
  public Optional<contacto> get_by_id(Integer id){
      return this.crepository.findById(id);
  }
  public List<contacto> get_Contactos(){
      return this.crepository.findAll();
  }
  public contacto create(contacto c) {
      return this.crepository.save(c);
  }
  public contacto update (contacto c){
      contacto c_db=this.get_by_id(c.getId()).get();
      c_db.setNombre(c.getNombre());
      c_db.setApellido(c.getApellido());
      c_db.setCelular(c.getCelular());
      c_db.setCorreo(c.getCorreo());
      c_db.setDireccion(c.getDireccion());
      return this.crepository.save(c_db);
  }
  public void delete (Integer id) {
      this.crepository.deleteById(id);
  }
}
