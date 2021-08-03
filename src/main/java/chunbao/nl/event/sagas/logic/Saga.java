package chunbao.nl.event.sagas.logic;

import chunbao.nl.event.event.Event;
import chunbao.nl.event.json.BaseJson;

public interface Saga {
  Event createSaga(BaseJson input);

  String startSaga(Event event);

  void resumeSaga(Event event);
}
