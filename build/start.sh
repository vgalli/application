#!/bin/bash

java -cp $(echo lib/*.jar | tr ' ' ':') com.vgalli.application.Application ./data.json 
