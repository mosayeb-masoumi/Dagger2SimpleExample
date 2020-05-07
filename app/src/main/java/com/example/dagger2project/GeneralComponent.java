package com.example.dagger2project;

import javax.inject.Inject;

import dagger.Component;

// third step  -  after this step we must click on hammer

@Component(modules = {GeneralModule.class})
public interface GeneralComponent {

  void  inject (MainActivity mainActivity);

}
