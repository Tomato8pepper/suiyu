var groupAnagrams = function (strs) {
    // 类似桶排序
  
    let counts = [];
    const hashTable = {};
    for (let i = 0; i < strs.length; i++) {
      const str = strs[i];
      counts = Array(26).fill(0);
      for (let j = 0; j < str.length; j++) {
        counts[str[j].charCodeAt(0) - "a".charCodeAt(0)]++;
      }
      const key = counts.join("");
      if (!hashTable[key]) {
        hashTable[key] = [str];
      } else {
        hashTable[key].push(str);
      }
    }
  
    return Object.values(hashTable);
  };