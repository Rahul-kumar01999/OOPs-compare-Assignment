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

//scalastyle:off magic.number
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {

//cases for checking whether PersonOne name length and age is <,> then PersonTwo
  "person" should "return True if name are same and age of PersonOne < PersonTwo " in{
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test",25)
    assert(personOne < personTwo)
  }

  it should "return False if name are same and age of PersonOne > PersonTwo " in{
    val personOne = new Person("Test", 25)
    val personTwo = new Person("Test",24)
    assert(personOne > personTwo)
  }

  it should "return True as Length of name of PersonOne < PersonTwo " in{
    val personOne = new Person("Test", 24)
    val personTwo = new Person("TestAgain",24)
    assert(personOne < personTwo)
  }

  it should "return False as Length of name of PersonOne > PersonTwo " in{
    val personOne = new Person("TestAgain", 25)
    val personTwo = new Person("Test",25)
    assert(personOne > personTwo)
  }

  it should "return valid for same name and same age PersonOne = PersonTwo " in{
    val personOne = new Person("Test", 25)
    val personTwo = new Person("Test",25)
    assert(personOne.compare(personTwo) == 0)
    }


}
