import React, { useState, useEffect } from 'react';

import { ENDPOINT_PERSON_FIND, LENGTH_NAME_PARTS, LIMIT_INPUT, SYMBOL_EMPTY_STRING, SYMBOL_SPACE } from 'common/constants';
import { API_URL } from 'common/configuration';
import Input from 'component/Input';
import Person from 'type/model/person';
import ArrayIndex from 'enum/array/index';

const Application = () => {
  const [personalCode, setPersonalCode] = useState<string>();
  const [name, setName] = useState<string>();
  const [persons, setPersons] = useState<Person[]>();

  useEffect(() => {
    if ((!personalCode || personalCode.length < LIMIT_INPUT) && (!name || name.length < LIMIT_INPUT)) {
      setPersons(undefined);
      return;
    }
    const findPersons = async (personalCode?: string, name?: string) => {
      let firstname = name || SYMBOL_EMPTY_STRING;
      let lastname = SYMBOL_EMPTY_STRING;
      const nameParts = name?.split(SYMBOL_SPACE);

      if (nameParts?.length === LENGTH_NAME_PARTS) {
        firstname = nameParts[ArrayIndex.ZERO];
        lastname = nameParts[ArrayIndex.ONE];
      }
      const response = await fetch(`${API_URL}${ENDPOINT_PERSON_FIND(firstname, lastname, personalCode || SYMBOL_EMPTY_STRING)}`);
      const persons = await response.json();
      setPersons(persons);
    };
    findPersons(personalCode, name).catch(console.error);
  }, [personalCode, name]);
  return <>
    <h1>Persons</h1>
    <div className="form">
      <Input label="Personal code" value={personalCode} onChange={setPersonalCode} />
      <Input label="Name" value={name} onChange={setName} />
    </div>
    <div className="dropdown">
      {persons?.map(({ id, firstname, lastname, personalCode }: Person) =>
        <p key={id.toString()}>Firstname: {firstname}, Lastname: {lastname}, Personal code: {personalCode}</p>
      )}
    </div>
  </>
};

export default Application;