import React, { useState, useEffect } from "react";

const RandomQuote = () => {
  const [quote, setQuote] = useState(""); // store quote
  const [author, setAuthor] = useState(""); // store author

  // Fetch quote from API
  const fetchQuote = async () => {
    try {
      const response = await fetch("https://api.quotable.io/random");
      const data = await response.json();
      setQuote(data.content);
      setAuthor(data.author);
    } catch (error) {
      console.error("Error fetching quote:", error);
      setQuote("Failed to fetch quote");
      setAuthor("");
    }
  };

  // Fetch a quote when component mounts
  useEffect(() => {
    fetchQuote();
  }, []);

  return (
    <div className="max-w-md mx-auto p-4 bg-white shadow rounded mt-4">
      <h2 className="text-xl font-bold mb-2">Random Quote</h2>
      <p className="italic mb-2">"{quote}"</p>
      <p className="text-right font-semibold">— {author}</p>
      <button
        onClick={fetchQuote}
        className="mt-4 px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600"
      >
        Get New Quote
      </button>
    </div>
  );
};

export default RandomQuote;
