import React from "react";
import RandomQuote from "./Components/RandomQuote";

function App() {
  return (
    <div className="min-h-screen bg-gray-100 p-8">
      <h1 className="text-3xl font-bold text-center mb-6">Welcome!</h1>
      <RandomQuote />
    </div>
  );
}

export default App;
