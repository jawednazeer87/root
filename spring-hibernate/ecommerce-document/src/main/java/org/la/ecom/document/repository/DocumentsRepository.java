package org.la.ecom.document.repository;

import org.la.ecom.document.model.Documents;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends MongoRepository<Documents, String>{
}