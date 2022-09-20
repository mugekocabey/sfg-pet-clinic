package services;

import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    // FRAGE
    // buraya dikkat, extends CrudService dedikten sonra silindiler
    //Vet  findById(Long id);
    //Vet save(Vet vet);
    //Set<Vet> findAll();
}
