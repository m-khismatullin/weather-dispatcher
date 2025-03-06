package ru.km.owm.dispatcher.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.km.owm.dispatcher.entity.Dummy;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
