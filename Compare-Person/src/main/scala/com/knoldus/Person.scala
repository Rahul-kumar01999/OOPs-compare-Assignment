// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus

//Implementation of Person class that extends Ordered trait
class Person(val name: String, val age: Int)  extends Ordered[Person]{
  def compare(that: Person): Int = {
    if(this.name.equals(that.name)){    //comparing name if name are equal then
      this.age - that.age               //subtracting that.age from this.age to get a boolean return
    }
    else {
      this.name.length - that.name.length
    }
  }
}