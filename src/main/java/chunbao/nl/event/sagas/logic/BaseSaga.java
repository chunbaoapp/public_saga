package chunbao.nl.event.sagas.logic;

import chunbao.nl.event.event.Event;
import chunbao.nl.event.json.BaseJson;

public class BaseSaga implements Saga {

  @Override
  public Event createSaga(BaseJson input) {
    return null;
  }

  @Override
  public String startSaga(Event event) {
    return null;
  }

  @Override
  public void resumeSaga(Event event) {}
}
