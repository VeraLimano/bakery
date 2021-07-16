package ru.mail.vera.app.security;

import ru.mail.vera.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
