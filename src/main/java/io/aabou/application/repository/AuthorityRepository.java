package io.aabou.application.repository;

import io.aabou.application.domain.Authority;

/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
