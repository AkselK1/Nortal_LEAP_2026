package com.nortal.library.persistence.jpa;

import com.nortal.library.core.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JpaMemberRepository extends JpaRepository<Member, String> {}
