import React from "react";
import ReactDOM from "react-dom/client";

import Application from './common/Application';
import { ID_ROOT } from 'common/constants';

const rootElement = document.getElementById(ID_ROOT);
if (!rootElement) throw new Error('Root element not found!');
const root = ReactDOM.createRoot(rootElement);

root.render(<Application />);