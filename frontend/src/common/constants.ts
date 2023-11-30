const ENDPOINT_PERSON = '/person';
export const ENDPOINT_PERSON_FIND = (firstname?: string, lastname?: string, personalCode?: string) => `${ENDPOINT_PERSON}?firstname=${firstname}&lastname=${lastname}&personal_code=${personalCode}`;

export const ID_ROOT = 'root';

export const LENGTH_NAME_PARTS = 2;

export const LIMIT_INPUT = 2;

export const SYMBOL_EMPTY_STRING = '';
export const SYMBOL_SPACE = ' ';