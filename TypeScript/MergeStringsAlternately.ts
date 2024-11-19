function mergeAlternately(word1: string, word2: string) {
  let i: number = 0;
  let k: number = 0;
  let merge: string[] = [];
  while (i < word1.length && k < word2.length) {
    merge.push(word1[i]);
    merge.push(word2[k]);
    i++;
    k++;
  }
  while (i < word1.length) {
    merge.push(word1[i]);
    i++;
  }

  while (k < word2.length) {
    merge.push(word2[k]);
    k++;
  }
  return merge.join("");
}

const word1 = "abc";
const word2 = "pqrxyz";
console.log(mergeAlternately(word1, word2));
