package chunbao.nl.event.sagas.dao;

import chunbao.nl.event.module.GuiUser;
import org.springframework.data.repository.CrudRepository;

public interface GuiUserRepo extends CrudRepository<GuiUser, String> {}
