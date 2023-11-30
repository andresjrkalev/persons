import ChangeEvent from 'type/event/change';

interface Property {
  label: string;
  value?: string;
  onChange: ChangeEvent;
}

export default Property;