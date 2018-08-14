package net.coronite.jcpetclinic.services;

import net.coronite.jcpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
