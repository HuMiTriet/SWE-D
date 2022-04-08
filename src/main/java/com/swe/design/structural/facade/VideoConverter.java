package com.swe.design.structural.facade;

// THe use of interface is there so that were there to be changes to the 
// subsystem implementation in the near future we can just pass the client code
// the new and correct concrete implmeneation of the subsystem.
// However the USE OF AN INTERFACE IS NOT REQUIRED.
interface VideoConverter {

  void convert(String video);

}
