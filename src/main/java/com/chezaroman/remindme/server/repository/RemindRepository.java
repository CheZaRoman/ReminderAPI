package com.chezaroman.remindme.server.repository;

import com.chezaroman.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by CheZaRoman on 26.02.2017.
 */
public interface RemindRepository extends JpaRepository<Remind, Long> {

}
