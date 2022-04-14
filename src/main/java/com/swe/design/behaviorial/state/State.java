package com.swe.design.behaviorial.state;

interface State {
  void tap(Keyboard keyboard, Key key);

  void hold(Keyboard keyboard, Key key);

  void unhold(Keyboard keyboard, Key key);
}
