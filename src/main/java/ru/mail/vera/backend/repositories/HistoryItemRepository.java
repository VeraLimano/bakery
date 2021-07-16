package ru.mail.vera.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.mail.vera.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
