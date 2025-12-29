package com.nortal.library.core.port;

import com.nortal.library.core.domain.Member;
import jakarta.persistence.NamedQuery;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
  Optional<Member> findById(String id);

  List<Member> findAll();

  Member save(Member member);

  void delete(Member member);

  boolean existsById(String id);


}
