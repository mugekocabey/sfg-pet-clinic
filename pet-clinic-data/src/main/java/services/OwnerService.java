package services;

import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Pet;

import java.util.Set;

public interface OwnerService extends CrudService<Pet, Long> {

    Owner findByLastName(Long id);



}
