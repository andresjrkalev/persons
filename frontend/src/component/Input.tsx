import React, { ChangeEvent } from 'react';

import { SYMBOL_EMPTY_STRING } from 'common/constants';
import Property from 'type/property/input';

const Input = ({ label, value, onChange }: Property) => {
  const handleOnChange = ({ target: { value } }: ChangeEvent<HTMLInputElement>) => onChange(value);
  return <>
    <label>{label}</label>:
    <input type="text" value={value || SYMBOL_EMPTY_STRING} onChange={handleOnChange} />
  </>;
};

export default Input;